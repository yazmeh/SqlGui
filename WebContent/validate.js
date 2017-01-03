/**
 * 
 */
function del(y) {
	document.forms["myForm"]["sub"].value=y;
}
function validateId() {
    var x = document.forms["myForm"]["id"].value;  
    
    if (x == "" ) {
        alert("Id must be filled out");
        return false;
    }
    if (isNaN(x))
    {
    	alert("Id is not Valid");
        return false;
    }

    return true;
    
}
function validateName() {
	var y = document.forms["myForm"]["name"].value;
	if (y == "") {
        alert("Name must be filled out");
        return false;
    }
	return true;
}
function validatePass() {
	var y = document.forms["myForm"]["pwd"].value;
	if (y == "") {
        alert("Pass must be filled out");
        return false;	
    }
	return true;
}
function validateUser() {
	var y = document.forms["myForm"]["userName"].value;
	if (y == "") {
        alert("User must be filled out");
        return false;	
    }
	return true;
}
function validateSal() {
	var z = document.forms["myForm"]["sal"].value;
	if (z == "") {
        alert("Salary must be filled out");
        return false;
    }
	if (isNaN(z)){
	    	alert("Salary is not Valid");
	        return false;
	}
	return true;
}
function validateForm1()
{
	if(validateId() && validateName() && validateSal())
	{
		return true;
	}
	return false;
}
function validateForm2()
{
	if(validateUser() && validatePass())
	{
		return true;
	}
	return false;
}

