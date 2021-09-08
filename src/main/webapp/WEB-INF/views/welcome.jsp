<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

	
	<h1>Welcome ${name} to My store bike Page From Saraya Tech</h1>
	

	<p>g 
		
		<table>
			<thead>
					<tr>
						<td>Image</td>
						<td>Year</td>
						<td>Make</td>
						<td>Model</td>
						<td> Delete bike</td>
					</tr>
			</thead>
			<tbody>
			<c:forEach items="${bikes}" var="bike">
				<tr>
					<td><img src = "${bike.image}" width="100" height="100" /></td>
					<td>${bike.year}</td>
					<td>${bike.make}</td>
					<td>${bike.model}</td>
					<td>&nbsp; &nbsp; 
					<a href="/delete.do?id=${bike.id}">Delete</a></td>
				</tr>
			</c:forEach>	
			</tbody>
			
			
			
		</table>
		<p>
		<form action="/bike.do" method="post">
			<input type="text" name = "yr">
			<input type="text" name = "mk">
			<input type="text" name = "md">
			<input type="text" name = "im">
			<input type="submit" value="Add a Bike">
		</form>
	</p>
<%@ include file="../common/footer.jspf"%>