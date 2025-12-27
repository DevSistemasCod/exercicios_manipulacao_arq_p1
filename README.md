# Manipulação de Arquivos
1)  Faça uma classe capaz de armazenar as informações de uma venda em um arquivo .csv. Os dados que devem ser gravados são: (int) número da venda, (String) nome do item vendido, (int) quantidade, (double) preço, (enum) forma de pagamento (dinheiro, pix, crédito ou débito)
  As informações devem ser gravadas em um arquivo de saída utilizando a API  NIO.2, por meio das classes Path e Files, com escrita baseada em Writer (por exemplo, BufferedWriter). Utilize o caractere “,” como separador dos dados (formato CSV simples). Após a gravação, crie um novo programa capaz de ler o arquivo gerado, utilizando também a API NIO.2, por meio das classes Path e Files, realizando a leitura com um Reader (por exemplo, BufferedReader).
  Considere um arquivo CSV simples, sem campos entre aspas ou separadores internos, e realize o tratamento adequado de exceções que possam ocorrer durante as operações de leitura e escrita em arquivo.
  
---

2) Faça uma classe capaz de armazenar as informações de um cadastro de livros em um arquivo .csv. Os dados que devem ser gravados são: (int) código do livro, (String) título, (int) número de páginas, (String) autor, (String) editora, (enum) classificação (romance, aventura, ficção ou técnico).
  As informações devem ser gravadas em um arquivo de saída utilizando a API NIO.2, por meio das classes Path e Files com escrita baseada em Writer (por exemplo, BufferedWriter). Utilize o caractere “,” como separador dos dados (formato CSV simples). Após a gravação, crie um novo programa capaz de ler o arquivo gerado, utilizando também a API NIO.2, por meio das classes Path e Files, realizando a leitura com um Reader (por exemplo, BufferedReader).
 Considere um arquivo CSV simples, sem campos entre aspas ou separadores internos, e realize o tratamento adequado de exceções que possam ocorrer durante as operações de leitura e escrita em arquivo.

---

3)  Em Java implemente a conversão de uma imagem .png em um arquivo binário .bin e posteriormente crie uma classe capaz de converter um binário .bin em .png. Para isso utilize as classes FileInputStream e FileOutputStream.

---

4) Crie uma classe chamada Produto em Java, com os seguintes atributos: nome (String), código de identificação (int) e preço (double). Em seguida, implemente uma classe chamada Produtos, que possui um ArrayList para armazenar objetos do tipo Produto. A classe Produtos deve possuir os seguintes métodos: adicionar(Produto produto),  listar(), remover(int codigo) e salvarEmArquivo(Path caminho) O método salvarEmArquivo deve salvar os dados dos produtos em um arquivo utilizando a API NIO.2, por meio das classes Path e Files, com escrita baseada em Writer (por exemplo, BufferedWriter). Utilize um formato simples de texto (ou CSV, se preferir), realizando o tratamento adequado de exceções. Por fim, crie uma classe principal contendo um método main para testar a implementação, realizando operações de adição, listagem, remoção e salvamento dos produtos em arquivo.

---

5) Implemente as classes Aluno e Turma, de modo que: A classe Aluno deve possuir os seguintes atributos: nome (String), matrícula (int), idade (int). A classe Turma deve possuir o atributo: listaDeAlunos: um ArrayList que armazena objetos do tipo Aluno. Além disso, a classe Turma deve implementar os seguintes métodos: adicionar(Aluno aluno), listar(), remover(int matricula) e salvarEmArquivo(Path caminho). O método salvarEmArquivo deve salvar os dados dos alunos em um arquivo utilizando a API NIO.2, por meio das classes Path e Files, com escrita baseada em Writer (por exemplo, BufferedWriter).
 Utilize um formato simples de texto (ou CSV, se preferir) e realize o tratamento adequado de exceções.
Por fim, implemente uma classe principal contendo um método main para testar a implementação, realizando operações de adição, listagem, remoção e salvamento dos alunos em arquivo.






