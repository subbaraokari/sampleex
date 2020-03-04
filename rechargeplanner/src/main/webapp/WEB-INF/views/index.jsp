<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	.main{
		width:500px;
		height:300px;
		margin-left:auto;
		margin-right:auto;
	}
	.title{
		text-align:center;
	}
</style>
</head>
<body>
	<h1 class="title">Recharge Planner</h1>
	<div class="main">
        <table>
            <f:form action="check" modelAttribute="customerDetails">
            <tr>
                <td><f:label path="name">Enter your name</f:label></td>
                <td><f:input type="text" path="name" id="name"/></td>
            </tr>
            <tr>
                <td><f:label path="mobileNo">Enter your mobile no</f:label></td>
                <td><f:input type="text" path="mobileNo" id="mobile"/></td>
            </tr>
            <tr>
                <td><f:label path="carrier">Select Your carrier</f:label></td>
                <td><f:select path="carrier" id="carrier">
                        <option value="airtel">Airtel</option>
                        <option value="vodafone">Vodafone</option>
                        <option value="cellone">Cellone</option>
                    </f:select>
                </td>
            </tr>
            <tr>
                <td><f:label path="previousRechargeDate">Your previous Recharge Date</f:label></td>
                <td><f:input type="date" path="previousRechargeDate" id="re_date"/></td>
            </tr>
            <tr>
                <td><f:label path="previousSelectedPackage">Your Previous Selected Package</f:label></td>
                <td><f:input type="text" path="previousSelectedPackage" id="package"/></td>
            </tr>
            <tr>
            	<td><input type="submit" value="Check Status"/></td>
            </tr>
        </f:form>
        </table>
        <h1>${msg}</h1>
    </div>
</body>
</html>