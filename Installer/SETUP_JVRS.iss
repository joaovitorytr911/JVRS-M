; SETUP JVRS - MULTIMIDIA JVRS
#define MyAppName "MULTIMIDIA JVRS"
#define MyAppVersion "0.1.0"
#define MyAppPublisher "Joao Vitor"
#define MyAppFolder "JOAO VITOR - MULTIMÍDIA JVRS"
#define MyAppExeName "JOAO VITOR - MULTIMÍDIA JVRS.exe"

[Setup]
AppId={{B0A9A7D4-2E18-4D8D-8E0A-9B3F9C7D1201}
AppName={#MyAppName}
AppVersion={#MyAppVersion}
AppPublisher={#MyAppPublisher}
DefaultDirName={localappdata}\Programs\JVRS\MultimidiaJVRS
DefaultGroupName={#MyAppName}
UninstallDisplayName={#MyAppName}
OutputDir=..\output
OutputBaseFilename=SETUP_JVRS
Compression=lzma2
SolidCompression=yes
WizardStyle=modern
PrivilegesRequired=lowest
ArchitecturesInstallIn64BitMode=x64
DisableProgramGroupPage=yes

[Languages]
Name: "brazilianportuguese"; MessagesFile: "compiler:Languages\BrazilianPortuguese.isl"

[Tasks]
Name: "desktopicon"; Description: "Criar atalho na area de trabalho"; GroupDescription: "Atalhos:"; Flags: unchecked

[Files]
Source: "..\dist\{#MyAppFolder}\*"; DestDir: "{app}"; Flags: ignoreversion recursesubdirs createallsubdirs

[Icons]
Name: "{autoprograms}\{#MyAppName}"; Filename: "{app}\{#MyAppExeName}"
Name: "{autodesktop}\{#MyAppName}"; Filename: "{app}\{#MyAppExeName}"; Tasks: desktopicon

[Run]
Filename: "{app}\{#MyAppExeName}"; Description: "Abrir a MULTIMIDIA JVRS"; Flags: postinstall nowait skipifsilent
