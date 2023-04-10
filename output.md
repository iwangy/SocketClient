```(base) ywang@Ians-Macbook-Pro SocketClient % java TCPClient djxmmx.net 17
Apr 09, 2023 10:03:01 PM TCPClient main
INFO: Connecting to djxmmx.net on port 17
Apr 09, 2023 10:03:01 PM TCPClient main
INFO: Connected to djxmmx.net on port 17
Apr 09, 2023 10:03:01 PM TCPClient main
INFO: Waiting for response

"Cause it's all in my head, I think about it over and over again, and I can�t keep picturing you with him, and it hurts so bad.
 Cause it's all in my head, I think about it over and over again, I replay it over and over again, and I can�t take it, I can�t shake it no..."
         - Nelly (Over And Over)
Apr 09, 2023 10:03:01 PM TCPClient main
INFO: Received response
```
```
(base) ywang@Ians-Macbook-Pro SocketClient % java TCPClient time.nist.gov 13
Apr 09, 2023 10:03:21 PM TCPClient main
INFO: Connecting to time.nist.gov on port 13
Apr 09, 2023 10:03:22 PM TCPClient main
INFO: Connected to time.nist.gov on port 13
Apr 09, 2023 10:03:22 PM TCPClient main
INFO: Waiting for response


60044 23-04-10 05:03:23 50 0 0 758.7 UTC(NIST) * 
```

```
Apr 09, 2023 10:03:22 PM TCPClient main
INFO: Received response

(base) ywang@Ians-Macbook-Pro SocketClient % java TCPClient tcpbin.com 4242 "Hello World"             
Apr 09, 2023 10:03:33 PM TCPClient main
INFO: Connecting to tcpbin.com on port 4242
Apr 09, 2023 10:03:33 PM TCPClient main
INFO: Connected to tcpbin.com on port 4242
Apr 09, 2023 10:03:33 PM TCPClient main
INFO: Sending message: Hello World
Apr 09, 2023 10:03:33 PM TCPClient main
INFO: Waiting for response

Hello World
```