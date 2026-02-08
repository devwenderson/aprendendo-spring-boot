import requests,json

class RequestAPI:
    BASE_URL = "http://localhost:8080/api"
    SUBTAREFAS_ENDPOINT = f"{BASE_URL}/subtarefas"

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

    @classmethod
    def listar_projetos(cls):
        response = requests.get(f"{cls.BASE_URL}/projetos")
        return response.json()

    @classmethod
    def criar_projetos(cls, iniciado_em, finalizado_em, finalizar_em, valor, descricao, id_usuario):
        data = {
            "iniciado_em": iniciado_em, 
            "finalizado_em": finalizado_em, 
            "finalizar_em": finalizar_em, 
            "valor": valor, 
            "descricao": descricao, 
            "id_usuario": id_usuario
        }

        response = requests.post(f"{cls.BASE_URL}/projetos", json=data)
        return response.status_code

    @classmethod
    def listar_subtarefas(cls):
        response = requests.get(cls.SUBTAREFAS_ENDPOINT)
        return response.json()

    @classmethod
    def criar_subtarefa(cls, iniciado_em, finalizado_em, finalizar_em, id_projeto, codigo_status, descricao):
        data = {
            "iniciado_em": iniciado_em, 
            "finalizado_em": finalizado_em, 
            "finalizar_em": finalizar_em, 
            "id_projeto": id_projeto,
            "descricao": descricao, 
            "codigo_status": codigo_status
        }

        response = requests.post(cls.SUBTAREFAS_ENDPOINT, json=data)
        return response.status_code

# id = 1
# nome = "Wenderson da Silva Nascimento"
# email = "wenderson.silva@gmail.com"
# senha = "1234"
# status = RequestAPI.criar_usuarios(nome=nome, email=email, senha=senha)
# print(status)

# print(RequestAPI.listar_usuarios())

# print(RequestAPI.buscar_usuarios_por_id(1)["status"])
# print(RequestAPI.deletar_usuario(3))
# print(RequestAPI.listar_usuarios())

inicado_em = "2026-02-06"
finalizado_em = ""
finalizar_em = "2026-02-12"
valor = 4000
descricao = "Projeto 2"
usuario = 1
# print(usuario)
# print(RequestAPI.listar_usuarios())


# print(RequestAPI.criar_projetos(inicado_em, finalizado_em, finalizar_em, valor, descricao, usuario))

# dados_str = json.dumps(RequestAPI.listar_projetos(), indent=4)
# print(dados_str)

iniciado_em = "2026-02-06"
finalizado_em = ""
finalizar_em = "2026-02-12"
id_projeto = 2
descricao = "Tarefa 1"
codigo_status = 3

# print(RequestAPI.listar_subtarefas())
criar_sbt_status = RequestAPI.criar_subtarefa(iniciado_em, finalizado_em, finalizar_em, id_projeto, codigo_status, descricao)
# print(criar_sbt_status)
print(RequestAPI.listar_subtarefas())

