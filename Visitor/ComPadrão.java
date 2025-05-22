  abstract class Produto {
    String nome;
    double preco;
  
    public Produto(String nome, double preco) {
      this.nome = nome;
      this.preco = preco;
    }
    
    public abstract double aceitar(Visitor visitor);
  }
  
  class Livro extends Produto {
    // Atributos específicos de livros
    public Livro(String nome, double preco) {
      super(nome, preco);
      // Inicialização de atributos de livros
    }
  
    @Override
    public double aceitar(Visitor visitor) {
      return visitor.visitarLivro(this);
    }
  }
  
  class Eletronico extends Produto {
    // Atributos específicos de eletrônicos
    public Eletronico(String nome, double preco) {
      super(nome, preco);
      // Inicialização de atributos de eletrônicos
    }
  
    @Override
    public double aceitar(Visitor visitor) {
      return visitor.visitarEletronico(this);
    }
  }
  
  class Roupa extends Produto {
    // Atributos específicos de roupas
    public Roupa(String nome, double preco) {
      super(nome, preco);
      // Inicialização de atributos de roupas
    }
  
    @Override
    public double aceitar(Visitor visitor) {
      return visitor.visitarRoupa(this);
    }
  }
  
  class CarrinhoCompras {
    List<Produto> produtos;
  
    public CarrinhoCompras() {
      this.produtos = new ArrayList<>();
    }
  
    public void adicionarProduto(Produto produto) {
      produtos.add(produto);
    }
  
    public double calcularValorTotal(Visitor visitor) {
      double total = 0;
      for (Produto produto : produtos) {
        total += produto.aceitar(visitor);
      }
      return total;
    }
  }

    interface Visitor {
    double visitarLivro(Livro livro);
    double visitarEletronico(Eletronico eletronico);
    double visitarRoupa(Roupa roupa);
  }
  
  class CalculadoraValorTotal implements Visitor {
    @Override
    public double visitarLivro(Livro livro) {
      // Lógica de cálculo específica para livros
    }
  
    @Override
    public double visitarEletronico(Eletronico eletronico) {
      // Lógica de cálculo específica para eletrônicos
    }
  
    @Override
    public double visitarRoupa(Roupa roupa) {
      // Lógica de cálculo específica para roupas
    }
  }
