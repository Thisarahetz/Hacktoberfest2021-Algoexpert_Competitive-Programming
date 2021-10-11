import socket    
host_name = socket.gethostname()    
IPAddress = socket.gethostbyname(host_name)    
print("Your Computer Name is:" + host_name)    
print("Your Computer IP Address is:" + IPAddress) 