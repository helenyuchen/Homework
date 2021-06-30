package com.example.demo;

import java.io.*;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "UploadServlet", value = "/UploadServlet")
@MultipartConfig

public class UploadServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Part part = request.getPart("upload");


        part.write("/Users/chenjiang/Desktop/a.png");
    }
}