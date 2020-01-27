function test(){
		  var fname1=document.userform.fname.value;
		  var lname1=document.userform.lname.value;
		  var pnum1=document.userform.pnum.value;
		  var mailid1=document.userform.mailid.value;
		  var addr1=document.userform.addr.value;
		  var atpos = mailid1.indexOf("@");
	      var dotpos = mailid1.lastIndexOf(".");
	      var len=pnum1.length;
	      var pass=document.userform.pass.value;
	      var rpass=document.userform.rpass.value;
	      var plen=pass.length;
		  if(fname1==="" || fname1===null ||  ! /^[a-zA-Z]*$/g.test(fname1))
			  {
			  alert("Enter valid first name");
			  return false;
			  }
		  else if(lname1==="" || lname1===null || ! /^[a-zA-Z]*$/g.test(lname1) )
			  {
			  alert("Enter valid last name");
			  return false;
			  }
		  	else if(isNaN(pnum1) || pnum1==="" || pnum1===null || len!==10)
			  {
			  alert("enter valid number only");
			  return false;
			  }
		  	 else if(mailid1==="" || mailid1===null || atpos < 1 || ( dotpos - atpos < 2))
			  {
		  		 alert("Please enter correct email ID");
		  	           
			  return false;
			  }
		  	 else if(addr1==="" || addr1===null)
			  {
			  alert("Enter address");
			  return false;
			  }
		  	 else if(pass!=rpass || plen <8 )
		  		 {
		  		alert("pasword word should be match and length of the passcode should be greter that 8 ");
		  		return false;
		  		 }
		 
		  


		}
