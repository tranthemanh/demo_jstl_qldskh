package com.example.demo_jstl_dskh;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CustomerServlet", value = "/customers")
public class CustomerServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Nguyễn Văn A", "01/01/1990", "Hà Nội", "image1.jpg"));
        customers.add(new Customer("Trần Thị B", "02/02/1985", "TP. HCM", "image2.jpg"));
        customers.add(new Customer("Lê Văn C", "03/03/1975", "Đà Nẵng", "image3.jpg"));

        request.setAttribute("customers", customers);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
