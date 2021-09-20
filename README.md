# DAC- Entrega 01 - Persistencia de um sistema para cadastrar eventos.

Descrição da entrega:

O objetivo do trabalho é criar alguns módulos de um sistema para cadastrar anais de eventos científicos. Esses anais são agregados em volumes de artigos. Nessa primeira entrega você deverá fornecer alguns elementos de sua camada de persistência. A seguir, é apresentada uma breve descrição das 3 principais entidades que compõem o sistema.


Uma entidade do tipo VOLUME representa o agregado de artigos aceitos em um dado evento. Para esta entidade, deve-se armazenar a sigla do evento (string com no máximo 32 caracteres), o número da edição do evento (número inteiro), a cidade onde foi realizado o evento (string com no máximo 64 caracteres), a data de início do evento (uma string no padrão "yyyy-mm-dd"), a descrição do volume em português (string com no máximo 2048 caracteres) e a descrição do volume em inglês (string com no máximo 2048 caracteres).
Além disso, esta entidade deve armazenar uma lista ordenada dos artigos que compõem o volume (lista referências para entidades do tipo ARTIGO).


Para as entidades do tipo ARTIGO deve-se armazenar o número que indica a ordem do artigo no volume (inteiro), o idioma do artigo (string  de tamanho 2 que pode assumir os valores "pt", "en" ou "es" para representar, respectivamente, português, inglês e espanhol), o título original (string com no máximo 256 caracteres), o título em inglês (string com no máximo 256 caracteres), o resumo original (string com no máximo 2048 caracteres), o resumo em inglês (string com no máximo 2048 caracteres), as palavras-chave originais (string com no máximo 256 caracteres em que as palvras-chave são separadas por ";"), as palavras-chave em inglês (string com no máximo 256 caracteres em que as palvras-chave são separadas por ";") e o número de páginas do artigo (inteiro). Além disso, esta entidade deve armazenar uma lista ordenada dos autores do artigo (lista referências para entidades do tipo AUTOR) e a referência para uma entidade do tipo VOLUME (o volume no qual o artigo está incluído). Cada ARTIGO só pode ser incluído em um único VOLUME.


Finalmente, para as entidades do tipo AUTOR deve-se armazenar o número que indica a ordem do autor no artigo (inteiro),  o e-mail (string compatível com e-mail), o primeiro nome (string com no máximo 64 caracteres), o nome do meio (string com no máximo 64 caracteres), o sobrenome (string com no máximo 64 caracteres), a afiliação do autor (string com no máximo 256 caracteres), a afiliação do autor em inglês (string com no máximo 256 caracteres), o país do autor (string  de tamanho 2 que pode assumir os valores "BR", "PT", "US", "FR", "UK", ou "ES" para representar, respectivamente, Brasil, Portugal, Estados Unidos, França, Reino Unido ou Espanha) e o regitro OrcID (string no padrão "XXXX-XXXX-XXXX-XXXX"). Cada AUTOR só pode estar relacionado a um ARTIGO.


A partir dessas informações forneça para o sistema:
a) Modelo de Classes contendo as classes de entidade.
b) A implementação das classes de entidades com JPA (código JAVA).
