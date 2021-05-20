# Lab06 - O Mundo de Wumpus

Estrutura de pastas:

~~~
├── README.md  <- arquivo apresentando a tarefa
│
├── dab      <- dados usados pelo jogo (arquivos CSV)
│
└── src <- pasta de arquivos fonte Java (.java)
|   │
|   └── mc322 <- raiz do seu pacote
|       │
|       └── lab06 <- arquivos fonte .java
│
└── bin <- pasta de arquivos binários Java (.class)
   │
   └── mc322 <- raiz do seu pacote
       │
       └── lab06 <- arquivos binários .class

~~~

## Arquivos Java do Jogo

> Coloque instruções sobre como acionar o jogo.
>
> Coloque um link para a pasta `src/mc322/lab06` onde estão os arquivos java da resolução do lab.

## Destaques de Arquitetura

> Nessa parte, devem ser apresentados trechos de código de destaque em que foram adotadas soluções que atendem um ou mais dos seis critérios de qualidade listados anteriormente. Por exemplo, pode ser dado destaque a uma solução encontrada pela equipe que permita fácil expansão caso novas classes de Componente sejam criadas.

### `Uso de um objeto sala pra armazenar componentes`

> Escolha recortes relevantes e/ou de destaque do seu código. O recorte de código deve ser curto (entre 5 a 10 linhas). Apresente um recorte (você pode usar reticências para remover partes menos importantes). Veja como foi usado o highlight de Java para o código.

~~~java
// Caverna.java -> construtor
    salas[i][j] = new Salas(null, null, null, null);
~~~
~~~java
    //Salas.java 
    Wunpus wunpus;
    Heroi heroi;
    Brisa brisa;
    Fedor fedor;
    Buraco buraco;
    Ouro ouro;
~~~
> O uso de um objeto sala para armazenar os outros componentes permite facil adição de novos componentes