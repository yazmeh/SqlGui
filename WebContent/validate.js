/**
 * 
 */

function validateForm() {
    var x = document.forms["myForm"]["id"].value;
    var y = document.forms["myForm"]["name"].value;
    var z = document.forms["myForm"]["sal"].value;
    if (x == "" ) {
        alert("Id must be filled out");
        return false;
    }
    if (isNan(x))
    {
    	alert("Id is not Valid");
        return false;
    }
    if (y == "") {
        alert("Name must be filled out");
        return false;
    }
    if (z == "") {
        alert("Salary must be filled out");
        return false;
    }
    
}