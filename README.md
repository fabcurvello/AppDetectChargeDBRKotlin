# App Detectar Carregador (DBR, Kotlin)

> Repositório didático: exercício prático de Android nativo com **Kotlin**, desenvolvido e aplicado em sala de aula pelo Prof. Fabricio Curvello.

## Sobre o projeto

Aplicativo que detecta quando o **cabo de energia é conectado ou desconectado**, usando um Broadcast Receiver registrado dinamicamente (DBR).

## Contexto acadêmico

Exercício aplicado em sala de aula, usado como prática guiada com os alunos.

## O que o app faz

- Registra um `BroadcastReceiver` para `ACTION_POWER_CONNECTED` e `ACTION_POWER_DISCONNECTED`.
- Atualiza um texto na tela: "Cabo de energia conectado" ou "Cabo de energia desconectado".
- Cancela o registro do receiver em `onDestroy()`.

## Conceitos trabalhados em aula

- `BroadcastReceiver` registrado dinamicamente (DBR)
- Eventos de sistema de conexão de energia
- Atualização da interface a partir de um receiver

## Tecnologias

- **Kotlin**
- **Android SDK** (Android Studio)
- **Gradle**
- `minSdk 28` / `compileSdk 34`

## Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/fabcurvello/AppDetectChargeDBRKotlin.git
   ```
2. Abra a pasta no **Android Studio** e aguarde a sincronização do Gradle.
3. Execute em um emulador ou dispositivo físico com Android compatível com a API 28 ou superior.

## Veja também

Outros repositórios de aula com o mesmo tema:

- [AppBroadcastReceiversJava](https://github.com/fabcurvello/AppBroadcastReceiversJava)
- [AppDetectBatteryLowDBRJava](https://github.com/fabcurvello/AppDetectBatteryLowDBRJava)
- [AppDetectBatteryLowDBRKotlin](https://github.com/fabcurvello/AppDetectBatteryLowDBRKotlin)
- [AppNotifBateryLevelBRDJava](https://github.com/fabcurvello/AppNotifBateryLevelBRDJava)
- [AppNotifBateryLevelBRDKotlin](https://github.com/fabcurvello/AppNotifBateryLevelBRDKotlin)
- [AppNotifBootCompletedBREJAVA](https://github.com/fabcurvello/AppNotifBootCompletedBREJAVA)
- [AppNotifBootCompletedBREKotlin](https://github.com/fabcurvello/AppNotifBootCompletedBREKotlin)

## Autor

**Fabricio Curvello**: professor de desenvolvimento de software no SENAI-RJ (desde 1997) e em faculdades do grupo Ânima Educação (IBMR e UNA).

- GitHub: [github.com/fabcurvello](https://github.com/fabcurvello)
- LinkedIn: [linkedin.com/in/fabriciocurvello](https://www.linkedin.com/in/fabriciocurvello)
- YouTube: [@fabriciocurvello](https://www.youtube.com/@fabriciocurvello)
