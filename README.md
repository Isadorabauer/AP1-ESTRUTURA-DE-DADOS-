**Maior/Menor:**  
Inicializa com `dados[0][0]` e percorre toda a matriz comparando cada elemento. O retorno ocorre **após** a verificação completa.

**Ordenação por linha (Insertion Sort):**  
Ordena cada linha separadamente, deslocando para a direita os maiores e inserindo o elemento no ponto correto.

**Ordenação global (Merge Sort):**  
Achata a matriz em vetor, ordena com Merge Sort (divide e intercala) e regrava o resultado ordenado na matriz, linha por linha.
---

## 3) Comparação entre os algoritmos de ordenação

### Diferenças de abordagem
- **Insertion Sort** — *iterativo*, estável. Adequado para ordenar **linhas** individualmente ou conjuntos pequenos/quase ordenados.
- **Merge Sort** — *recursivo* (dividir para conquistar), estável. Adequado para ordenar **todos os elementos**.

### Complexidade de tempo e espaço

| Algoritmo      | Melhor | Médio       | Pior        |
|----------------|--------|-------------|-------------|
| Insertion Sort | O(n)   | O(n²)       | O(n²)       | 
| Merge Sort     | O(n log n)| O(n log n)  | O(n log n) |     


### Casos de maior eficiência
- **Insertion Sort:** poucos elementos por linha; dados já ordenados ou quase ordenados; casos mais simples.
- **Merge Sort:** grande volume de dados; entrada desordenada; necessidade de desempenho consistente (inclusive no pior caso).

---

## 4) Conclusões (dificuldades e aprendizados)
- **Insertion Sort** é simples e eficaz para **linhas pequenas** ou dados quase ordenados, porém degrada para O(n²) em cenários grandes.
- **Merge Sort** mantém **O(n log n)** independentemente da ordem inicial, sendo adequado para **ordenar toda a matriz** (via vetor auxiliar), ao custo de **memória adicional**.
- Achamos o **Merge Sort** mais díficil de fazer, por conta da lógica complicada.
- Aprendemos melhor todo o conteúdo que a AP1 abrange de forma prática.
---
