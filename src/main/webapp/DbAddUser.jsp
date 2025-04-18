<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
 <style>
        .form-container {
            max-width: 500px; /* You can reduce to 400px or 300px if you want it narrower */
            margin: 50px auto;
        }
    </style>
</head>
<body>

<div class="container">
    <div class="form-container border p-4 rounded shadow-sm bg-light">
        <h4 class="text-center mb-4">Save User</h4>
        <form action="DbSaveUserServlet" method="post">
            <div class="mb-3">
                <label for="name" class="form-label">Name</label>
                <input type="text" class="form-control" id="name" name="name" required />
            </div>

            <div class="mb-3">
                <label for="mobile" class="form-label">Mobile Number</label>
                <input type="text" class="form-control" id="mobile" name="mobile" required />
            </div>

            <div class="mb-3">
                <label for="credits" class="form-label">Credits</label>
                <input type="text" class="form-control" id="credits" name="credits" required />
            </div>

            <div class="d-grid">
                <button type="submit" class="btn btn-primary">Save</button>
            </div>
        </form>
    </div>
</div>




<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>