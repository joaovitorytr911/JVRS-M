# Plugins do Euro Truck Simulator 2 — MULTIMÍDIA JVRS

Esta pasta documenta os plugins encontrados no arquivo recebido para o projeto JVRS.

## Inventário do pacote recebido

- `ets2_brake_fade.dll` — plugin relacionado ao efeito de fading dos freios.
- `brake_fade_v07.ini` — configuração do Brake Fade.
- `brake_fade_v07.log` — registro de execução anterior (mantido apenas como referência).
- `ts-fmod-plugin.dll` — plugin de áudio FMOD.
- `ts-fmod-plugin/*.bank` e arquivos `.guids` — bancos de áudio e metadados.

## Estado deste repositório

Os binários e bancos de áudio ainda **não foram publicados** nesta pasta. O pacote original tem aproximadamente 249 MB e inclui arquivos de terceiros; antes de redistribuí-los, é necessário confirmar as respectivas licenças/permissões. Arquivos grandes devem ser versionados com Git LFS, não como commits Git comuns.

Não instale nem substitua plugins do ETS2 apenas com base neste inventário. Compatibilidade com a versão do jogo e com outros mods precisa ser testada no computador de destino.

## Estrutura planejada

```
Plugins_DLL/
  README.md
  .gitattributes
  plugins/
    ets2_brake_fade.dll
    brake_fade_v07.ini
    ts-fmod-plugin.dll
    ts-fmod-plugin/
      *.bank
      *.guids
```
