<%@ include file="common/header.jspf"%>

<div class="container">
	<p>
		<font color="red">${errorMessage}</font>
	</p>
	<h1>Log in</h1>
	<form action="/login" method="POST">
		<fieldset class="form-group">
			<label>Name</label> <input name="name" type="text"
				class="form-control" required="required" />
		</fieldset>

		<fieldset class="form-group">
			<label>Password</label> <input name="password" type="password"
				class="form-control" required="required" />
		</fieldset>
		<input type="submit" class="btn btn-success" />
	</form>
</div>
<%@ include file="common/footer.jspf"%>
