<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Second Page</title>
</head>
<body>
	<p>Admin page</p>
	
	<header>
    	<h1>First library</h1>
    	<h3>search book</h3>
    	<div class="subscribe">
    		<form action="SimpleServlet" method="post">
	    		<input type = "hidden" name="action"  value = "output">	    	    	    	   
	     	    <input type="submit" value="output ">
	     	    <c:forEach var="val" items="${listbook}">
			    	 <form action="SimpleServlet" method="post">
				    	<input type = "hidden" name="action"  value = "delete">
				    	<input type = "hidden" name="book_id"  value = "${val.getId()}" >
				    	<input type="submit"  value="delete">
				    	<input type = "hidden" name="action"  value = "edit">
				    	<input type="submit"  value="edit">
				    </form>
				    	
				    	<p>${val.getId()}</p>				    		 
				    	<p>${val}</p>	
				    		
				    				    		
			    	</c:forEach>
	   		 </form> 
	    	<form action="SimpleServlet" method="post">
	    		<input type = "hidden" name="action"  value = "search">
	    	    <input type="text" name="search" placeholder="enter book name" required>	    	   
	     	    <input type="submit" value="search">
	   		 </form> 
	   		 <form action="SimpleServlet" method="post">
	    		<input type = "hidden" name="action"  value = "add">
	    	    <input type="text" name="addName" placeholder="add name book" required>
	    	    <input type="text" name="addAuthor" placeholder="add name author" required>	    	   
	    	    <input type="text" name="addYear" placeholder="add year" pattern="[0-9]{4}" required>	    	   
	    	    	    	   
	     	    <input type="submit" value="add">
	   		 </form>       
    	</div>
        <p>*You can not use without registering.</p>
        
           <div class="book">
		       <p>список книг</p>
			    <form action="SimpleServlet" method="post">
			    	  
			    	
			    	<c:forEach var="val" items="${listbook}">
			    	 <form action="SimpleServlet" method="post">
				    	<input type = "hidden" name="action"  value = "delete">
				    	<input type = "hidden" name="book_id"  value = "${val.getId()}" >
				    	<input type="submit"  value="delete">
				    	<input type = "hidden" name="action"  value = "edit">
				    	<input type="submit"  value="edit">
				    </form>
				    	
				    	<p>${val.getId()}</p>				    		 
				    	<p>${val}</p>	
				    		
				    				    		
			    	</c:forEach>    			    	   
	     	    
	   		 
					</form>       
    	</div>

</header>
    

    		
       
</body>
</html>