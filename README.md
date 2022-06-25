# gRPC-SpringBoot

grpc has 4 types
uniary (1 req 1 res)
client streaming (many req 1 res)
server streamin (1 req many res)
binary (many req many res)

Step1
-goto proto directory create scheme and from the proto dir run 'mvn compile'
-the above will auto generate methods in target folder (its similar to repository)

Step2
-go to grpc-service directory and override the method in service class

Step3
-go to client directory call the grpc-service method
-and in the controller use the service method


client controller -> client service -> grpc-service -> proto 
