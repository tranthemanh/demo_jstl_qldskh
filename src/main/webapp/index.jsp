<%@ page import="com.example.demo_jstl_dskh.Customer" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Danh sách khách hàng</title>
</head>
<body>
<h1>Danh sách khách hàng</h1>
<%
    List<Customer> customers = new ArrayList<>();
    customers.add(new Customer("Nguyễn Văn A", "01/01/1990", "Hà Nội", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fvi.pngtree.com%2Ffree-backgrounds-photos%2Fnh%25C3%25A2n-vi%25C3%25AAn-nam&psig=AOvVaw0_iO_4UsPKw5ES-ZvgylvU&ust=1722302849585000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCOCmqZ6My4cDFQAAAAAdAAAAABAE"));
    customers.add(new Customer("Trần Thị B", "02/02/1985", "TP. HCM", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fvi.pngtree.com%2Ffreebackground%2Ftelephone-operator--financial-female-company-etiquette-photographs-with-pictures_1521526.html&psig=AOvVaw0_iO_4UsPKw5ES-ZvgylvU&ust=1722302849585000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCOCmqZ6My4cDFQAAAAAdAAAAABAJ"));
    customers.add(new Customer("Lê Văn C", "03/03/1975", "Đà Nẵng", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fhtmediagroup.vn%2Fchup-anh-profile-tu-van-vien-dep%2F&psig=AOvVaw0_iO_4UsPKw5ES-ZvgylvU&ust=1722302849585000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCOCmqZ6My4cDFQAAAAAdAAAAABAQ"));

    request.setAttribute("customers", customers);
%>
<table border="1">
    <tr>
        <th>Tên</th>
        <th>Ngày sinh</th>
        <th>Địa chỉ</th>
        <th>Ảnh</th>
    </tr>
    <c:forEach var="customer" items="${customers}">
        <tr>
            <td>${customer.name}</td>
            <td>${customer.birthDate}</td>
            <td>${customer.address}</td>
            <td><img src="${customer.imageUrl}" alt="${customer.name}" width="100" height="100"></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>