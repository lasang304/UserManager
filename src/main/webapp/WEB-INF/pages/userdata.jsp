<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>

<html>
<head>
    <title>UserData</title>

    <style type="text/css">
        .tg {
            border-collapse: collapse;
            border-spacing: 0;
            border-color: #ccc;
        }

        .tg td {
            font-family: Arial, sans-serif;
            font-size: 14px;
            padding: 10px 5px;
            border-style: solid;
            border-width: 1px;
            overflow: hidden;
            word-break: normal;
            border-color: #ccc;
            color: #333;
            background-color: #fff;
        }

        .tg th {
            font-family: Arial, sans-serif;
            font-size: 14px;
            font-weight: normal;
            padding: 10px 5px;
            border-style: solid;
            border-width: 1px;
            overflow: hidden;
            word-break: normal;
            border-color: #ccc;
            color: #333;
            background-color: #f0f0f0;
        }


    </style>

</head>
<body>
<h1>User Details</h1>


<c:if test="${!empty listEquipment}">
    <table class="tg">
        <tr>
            <th width="80">ID</th>
            <th width="120">Name</th>
            <th width="40">S/N</th>
            <th width="120">Specifications</th>
            <th width="120">Type</th>
        </tr>
        <c:forEach items="${listEquipment}" var="equipment">
            <tr>
                <th>${equipment.id}</th>
                <td>${equipment.equipmentName}</td>
                <td>${equipment.equipmentSN}</td>
                <td>${equipment.equipmentSpecifications}</td>
                <td>${equipment.equipmentType}</td>
            </tr>
        </c:forEach>
    </table>
</c:if>

<c:if test="${empty listEquipment}">

    <h3>No equipments</h3>
</c:if>




</body>
</html>