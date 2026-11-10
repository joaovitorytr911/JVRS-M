# SETUP JVRS — MULTIMÍDIA JVRS

Este diretório contém a configuração do instalador Windows **SETUP_JVRS.exe** (Inno Setup).

## Estado atual
A configuração do instalador foi preparada, mas **o instalador ainda não foi gerado**: o repositório ainda não contém o aplicativo compilado.

## Arquivo esperado
Antes de compilar, adicione ao repositório:

```
dist/
  JOAO VITOR - MULTIMÍDIA JVRS.exe
  assets/                 (opcional)
Installer/
  SETUP_JVRS.iss
```

Depois, execute o workflow **Build SETUP JVRS** em GitHub Actions. O resultado será publicado como artefato `SETUP_JVRS`.

## O que o instalador configura
- Instalação por usuário em AppData (sem pedir administrador).
- Atalho no menu Iniciar.
- Atalho opcional na área de trabalho.
- Desinstalador do Windows.
- Assistente visual moderno com progresso real do Inno Setup.

## Importante
A tela de progresso acompanha a cópia real dos arquivos; não é uma animação falsa. Plugins de terceiros e bancos de áudio não são incluídos automaticamente. Só adicione arquivos cuja redistribuição esteja autorizada.

**Ainda falta integrar o código-fonte e gerar o executável principal da MULTIMÍDIA JVRS.**
