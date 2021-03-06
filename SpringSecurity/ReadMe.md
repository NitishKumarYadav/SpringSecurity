#Spring Security

##Spring security v1
* Basic spring security application with hardcoded username and password.

* On hitting localhost:8080 it will promt for username and password where it is "chakravyuh" and "abhimanyu" respectively 

### Dependency used
Spring security, web ,thymeleaf

### Reference document:
* [Okata developer Guide](https://developer.okta.com/blog/2019/10/30/java-oauth2)

## @GetMapping
 with only (/)  will always redirect application to getCurrent user on successful login
## thymeleaf
* Since we are using Thymelefe on Returning a string value it will try to find the html page from src/main/resources/template path and serve it

* In our case we are returning "home" with getCurrentUser method and we do have home.htm in template path

## The @EnableWebSecurity annotation and WebSecurityConfigurerAdapter 

* Both work together to provide web based security. By extending WebSecurityConfigurerAdapter 

* We Require the user to be authenticated prior to accessing any URL within our application

* We Create a user with the username “chakravyuh”, password “abhimanyu”, and role of “USER”

* Enables HTTP Basic and Form based authentication
* Spring Security will automatically render a login page and logout success page for you


