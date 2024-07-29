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
        customers.add(new Customer("Nguyễn Văn A", "01/01/1990", "Hà Nội", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fvi.pngtree.com%2Ffree-backgrounds-photos%2Fnh%25C3%25A2n-vi%25C3%25AAn-nam&psig=AOvVaw0_iO_4UsPKw5ES-ZvgylvU&ust=1722302849585000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCOCmqZ6My4cDFQAAAAAdAAAAABAE"));
        customers.add(new Customer("Trần Thị B", "02/02/1985", "TP. HCM", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fvi.pngtree.com%2Ffreebackground%2Ftelephone-operator--financial-female-company-etiquette-photographs-with-pictures_1521526.html&psig=AOvVaw0_iO_4UsPKw5ES-ZvgylvU&ust=1722302849585000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCOCmqZ6My4cDFQAAAAAdAAAAABAJ"));
        customers.add(new Customer("Lê Văn C", "03/03/1975", "Đà Nẵng", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fhtmediagroup.vn%2Fchup-anh-profile-tu-van-vien-dep%2F&psig=AOvVaw0_iO_4UsPKw5ES-ZvgylvU&ust=1722302849585000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCOCmqZ6My4cDFQAAAAAdAAAAABAQ"));

        request.setAttribute("customers", customers);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
