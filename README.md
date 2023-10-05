# Empréstimos
Implementar um serviço que determine quais modalidades de empréstimo uma pessoa tem acesso.

## As modalidades de empréstimo que serão analisadas são:
- Empréstimo pessoal: Taxa de juros de 4%.
- Empréstimo consignado: Taxa de juros de 2%.
- Empréstimo com garantia: Taxa de juros de 3%.

## As modalidades de empréstimo disponíveis para uma pessoa são baseadas em algumas variáveis específicas, são elas:
- Idade
- Salário
- Localização

## Requisitos
- Conceder o empréstimo pessoal se o salário do cliente for igual ou inferior a R$ 3000.
- Conceder o empréstimo pessoal se o salário do cliente estiver entre R$ 3000 e R$ 5000, se o cliente tiver menos de 30 anos e residir em São Paulo (SP).
- Conceder o empréstimo consignado se o salário do cliente for igual ou superior a R$ 5000.
- Conceder o empréstimo com garantia se o salário do cliente for igual ou inferior a R$ 3000.
- Conceder o empréstimo com garantia se o salário do cliente estiver entre R$ 3000 e R$ 5000, se o cliente tiver menos de 30 anos e residir em São Paulo (SP).
