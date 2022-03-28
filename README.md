<!DOCTYPE html>

<html>

<h2>Simple Url Shortener.</h2> 
<div>
It uses CRC32C to generate a unique hash of reasonable length for every inputted url. Whole application is Spring Boot based. It also exposes two REST style endpoints to communicate with the outside world. One endpoint is responsible for shortening of the urls while the second is response for retrieving already shortened urls. Persistence is provided by H2 in-memory database so there is no persistence between restarts of application.
 </div>
</html>


</html>
