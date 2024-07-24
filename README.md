## Exercício Avaliativo 01 DEOO 🍕

Integrantes:
- Augusto G. Serrano
- Caio S. Lopes

### Resposta
No exemplo citado o objeto builder precisa ser instanciado duas vezes para que não haja dados errados na criação dos objetos Pizza. Isso ocorre, pois se reutilizarmos o objeto builder já instanciado, os dados inseridos no builder serão copiados para as novas instancias de Pizza.

**Comportamento**

Pizza.Builder: É um objeto usado para configurar os atributos de Pizza. Cada instância de Pizza.Builder não tem relação com o objeto externo Pizza.

Pizza: Cada instância de Pizza armazena os dados específicos daquela pizza.

