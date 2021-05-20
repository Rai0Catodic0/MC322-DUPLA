# Lab06 - O Mundo de Wumpus

## Arquivos Java do Jogo

> Iniciar o programa
> Digitar a pasta que contém o arquivo csv para montagem inicial da caverna
> Digitar o nome do jogador
> Aparecerá o estado inicial da caverna e a pontuação inicial
> Digitar as instrunções para o herói e jogar

> [Arquivos Java do jogo](https://github.com/Rai0Catodic0/MC322-DUPLA/tree/main/Lab06/src/mc322/lab06)

> [Arquivos teste](https://github.com/Rai0Catodic0/MC322-DUPLA/tree/main/Lab06/src/mc322/db)

## Destaques de Arquitetura

### `Encapsulamento no herói`

~~~java
    public void mover(int x,int y){
       caverna.Inserir(x, y, this);
       caverna.Remover(xAnterior, yAnterior, this);
       ...

            if (this.caverna.ExisteBuraco(x,y)) {
                this.noJogo = false;
                this.pontos -= 1000;
            } else if (this.caverna.ExisteWunpus(x,y)) {
	 	//luta com wunpus	
               ...
                } else {
                   ...
                }
            }
    }

    public void AtivarFlecha(){
        ...
    }

    public void CapturarOuro(){
       ...
    }
~~~

> Todas as ações que são do escopo do herói estão, como seus movimentos, uso de flechas e ouro estão concentradas no componente do herói, o que influencia na questão do encapsulamento, fazendo com ue possíveis mudanças no movimento do herói, só demandem alteração no componente herdeiro "herói"
