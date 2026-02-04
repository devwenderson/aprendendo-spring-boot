import requests

class RequestAPI:
    BASE_URL = "http://localhost:8080/api"

    @classmethod
    def criar_usuarios(cls, nome, email, senha):
        dados = {
            "nome": nome, 
            "email": email, 
            "senha": senha
        }
        response = requests.post(f"{cls.BASE_URL}/usuarios", json=dados)
        return response.status_code
    
    @classmethod
    def atualizar_usuarios(cls, id, nome, email, senha):
        dados = {
            "email": email, 
            "nome": nome, 
            "senha": senha
        }
        response = requests.put(f"{cls.BASE_URL}/usuarios/{id}", json=dados)
        return response.status_code

    @classmethod
    def listar_usuarios(cls):
        response = requests.get(f"{cls.BASE_URL}/usuarios")
        return response.json()
    
    @classmethod
    def buscar_usuarios_por_id(cls, id):
        response = requests.get(f"{cls.BASE_URL}/usuarios/{id}")
        return response.json()
    
    @classmethod
    def deletar_usuario(cls, id):
        response = requests.delete(f"{cls.BASE_URL}/usuarios/{id}")
        return response.status_code

id = 1
nome = "Wenderson da Silva Nascimento"
email = "wenderson.silva@gmail.com"
senha = "1234"
# status = RequestAPI.criar_usuarios(nome=nome, email=email, senha=senha)
print(RequestAPI.listar_usuarios())


# print(RequestAPI.buscar_usuarios_por_id(1)["status"])
print(RequestAPI.deletar_usuario(3))
print(RequestAPI.listar_usuarios())

