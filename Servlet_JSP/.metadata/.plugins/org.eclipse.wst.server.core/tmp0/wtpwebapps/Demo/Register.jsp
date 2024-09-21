<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Form</title>
<style>


</style>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body style="background-image:url('img/register.png'); background-size:cover;">
	<div class="container" style="margin-top: 150px;">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-header">
						<h1 class="text-center">Register Form</h1>
					</div>
					<div class="card-body" class="">
						<form action="RegisterServlet" method="post" class="text-center">
						<div class="mb-2">
								<label class="form-label">Name</label> <input type="text"
									required class="form-control" name="name">
							</div>
							<div class="mb-2">
								<label class="form-label">Email</label> <input type="email"
								name="email"	required class="form-control">
							</div>
							<div class="mb-2">
								<label class="form-label">Address</label> <input type="text"
									required class="form-control" name="address">
							</div>
							<div class="mb-2">
								<label class="form-label">Password</label> <input
								name="password"	type="password" required class="form-control">
							</div>
							<button type="submit" class="btn btn-primary">Submit</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
</html>