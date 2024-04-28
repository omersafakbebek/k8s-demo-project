from locust import HttpUser, task, between
import string, random

def generate_random_param():
    length = 10
    letters = string.ascii_lowercase
    return ''.join(random.choice(letters) for _ in range(length))

class ApiUser(HttpUser):
    wait_time = between(1,5)
    @task(1)
    def print_param(self):
        self.client.get(f"/print-param?param={generate_random_param()}", name="/print-param?param={val}")





