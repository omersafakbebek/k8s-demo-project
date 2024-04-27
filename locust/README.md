## Run with web UI
```locust -f locustfile.py --host http://<IngressAddress>:80```
## Run without web UI
```locust -f locustfile.py --headless -u <#ofUsers> -r <spawnRate> --host http://<IngressAddress>:80```
