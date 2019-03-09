@echo off
DEL "target\Venderonis Test.jar"
DEL "..\DuelAcademy Backups\Survival\1-25-19\plugins\Venderonis Test.jar"
RENAME "target\venderonis-1.12.2-Beta 1.2.jar" "Venderonis Test.jar"
COPY "target\Venderonis Test.jar" "..\DuelAcademy Backups\Survival\1-25-19\plugins\"