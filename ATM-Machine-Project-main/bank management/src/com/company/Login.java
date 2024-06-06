package com.company;

public class Login {
String username;
String password;
Login(){
username="ritika";
password="12345";
}
boolean validate( String username, String password) {
if(this.username.equalsIgnoreCase(username) &&
this.password.equals(password))
return true;
else
return false;
}
}