
  
  /*var userName = $("#username"); 
  var userPass = $("#password"); 
  

  


   /* else
    	{
    	var form = $('#formL');
    	form.submit(function () {
    	 
    	$.ajax({
    	type: form.attr('method'),
    	url: form.attr('action'),
    	data: form.serialize(),

    	});
    	 
    	
    	});
    	}*/
    
   /* var xmlDoc = window.XMLHttpRequest ? new XMLHttpRequest() : new ActiveXObject("Microsoft.XMLHTTP");
    
    xmlDoc.open('POST', "/Helper", true);
    xmlDoc.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
   
    xmlDoc.onreadystatechange = function() {
      if (xmlDoc.readyState === 4 && xmlDoc.status === 200) {
        callback(xmlDoc);
      }
    }
    data={"use":uid+":"+pass};
   
    xmlDoc.send(data);*/

    
   
    	
    
    
    /*var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	    	 var user=$('#userid').val();
	          var pwd=$('#pswrd').val();
	          
	    }
	  };
	  xhttp.open("POST", "/Controller", true);
	  xhttp.send();*/

function test()
{
	var uid=document.getElementById("userid").value;
	var pass=document.getElementById("password").value;
	var atpos = uid.indexOf("@");
    var dotpos = uid.lastIndexOf(".");
    
    if(uid==="" || uid===null || atpos < 1 || ( dotpos - atpos < 2))
	  {
		 alert("Please enter correct valid ID");
		 return false;
	  }
    else if(pass==="")
    	{
    	alert("passcode cannot be null");
    	return false;
    	
    	}
    else
    	{
    
    	
    	 $.ajax
         (
         {
        	 type:'POST',
             url:'Controller',
             
             data: { user3:uid,pass3:pass},
            /* contentType:'applicatio/json',
             dataType:'json',*/
             success: function (data) {
                alert('Success');

             },
             error: function () {
              alert('Error');
             }
             
         }
     );
    	}
    			
    			
 }



