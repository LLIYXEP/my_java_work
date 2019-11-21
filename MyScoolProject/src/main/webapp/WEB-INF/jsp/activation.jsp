<div th:replace="parts/header">...</div>

<div th:replace="parts/containerHeader">...</div>


	<div>
		<div class="row">
			<div class="col-sm-12">
    			<h2>Click to activate [[${user.username}]]</h2>
    		</div>
    		
    		<form method="post" action="${flowExecutionUrl}">
		    	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		        <input type="submit" name="_eventId_activate" value="activate" />
		        <input type="submit" name="_eventId_cancel" value="cancel" />
		    </form>
    		
    	</div>
    </div>
 
<div th:replace="parts/containerFooter">...</div>

<div th:replace="parts/footer">...</div>