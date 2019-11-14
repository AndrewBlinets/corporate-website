package by.ipps.dao.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
@RequestMapping("/image")
public class ImageController {

    @PostMapping
//    @RequestMapping(value = "/", consumes = MediaType.ALL_VALUE, produces = MediaType.IMAGE_JPEG_VALUE)
    @ResponseBody
    public String saveImage(@RequestParam("file") MultipartFile file) {
        String name = null;
        if (!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes();
                name = file.getOriginalFilename();
                String rootPath = "C:\\path\\";  //try also "C:\path\"
                File dir = new File(rootPath + File.separator + "loadFiles");
                if (!dir.exists()) {
                    dir.mkdirs();
                }
                File uploadedFile = new File(dir.getAbsolutePath() + File.separator + name);
                BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(uploadedFile));
                stream.write(bytes);
                stream.flush();
                stream.close();
//                logger.info("uploaded: " + uploadedFile.getAbsolutePath());
                return "You successfully uploaded file=" + name;
            } catch (Exception e) {
                return "You failed to upload " + name + " => " + e.getMessage();
            }
        } else {
            return "You failed to upload " + name + " because the file was empty.";
        }
    }

    @GetMapping
    public void getImage(HttpServletResponse response) throws IOException {
        String rootPath = "C:\\path\\";  //try also "C:\path\"
        File dir = new File(rootPath + File.separator + "loadFiles");
        File uploadedFile = new File(dir.getAbsolutePath() + File.separator + "MONSTAT.png");
        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", "attachment; filename=MONSTAT.png");
        byte[] array = Files.readAllBytes(Paths.get(rootPath + "\\loadFiles\\MONSTAT.png"));
        response.getOutputStream().write(array);
    }
}
