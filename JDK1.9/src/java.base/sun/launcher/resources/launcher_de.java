package sun.launcher.resources;

import java.util.ListResourceBundle;

public final class launcher_de extends ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "java.launcher.X.macosx.usage", "\nDie folgenden Optionen sind f\u00FCr Mac OS X spezifisch:\n    -XstartOnFirstThread\n                      main()-Methode f\u00FCr den ersten (AppKit) Thread ausf\u00FChren\n    -Xdock:name=<application name>\n                      Den im Dock angezeigten Standardanwendungsnamen \u00FCberschreiben\n    -Xdock:icon=<Pfad zu Symboldatei>\n                      Das im Dock angezeigte Standardsymbol \u00FCberschreiben\n\n" },
            { "java.launcher.X.usage", "\n    -Xbatch           Deaktiviert Hintergrundkompilierung\n    -Xbootclasspath/a: <Durch {0} getrennte Verzeichnisse und ZIP-/JAR-Dateien>\n                      an Ende von Bootstrap Classpath anh\u00E4ngen\n    -Xcheck:jni       F\u00FChrt zus\u00E4tzliche Pr\u00FCfungen f\u00FCr JNI-Funktionen aus\n    -Xcomp            Erzwingt Kompilierung von Methoden beim ersten Aufruf\n    -Xdebug           Wird zur Abw\u00E4rtskompatiblit\u00E4t bereitgestellt\n    -Xdiag            Zeigt zus\u00E4tzliche Diagnosemeldungen an\n    -Xfuture          Aktiviert strengste Pr\u00FCfungen, wird als m\u00F6glicher zuk\u00FCnftiger Standardwert erwartet\n    -Xint             Nur Ausf\u00FChrung im interpretierten Modus\n    -Xinternalversion\n                      Zeigt detailliertere JVM-Versionsinformationen an als die\n                      Option \"-version\"\n    -Xloggc:<Datei>    Protokolliert GC-Status in einer Datei mit Zeitstempeln\n    -Xmixed           Ausf\u00FChrung im gemischten Modus (Standard)\n    -Xmn<Gr\u00F6\u00DFe>        Legt die anf\u00E4ngliche und die maximale Gr\u00F6\u00DFe (in Byte) des Heaps\n                      f\u00FCr die junge Generation (Nursery) fest\n    -Xms<Gr\u00F6\u00DFe>        Legt die anf\u00E4ngliche Java-Heap-Gr\u00F6\u00DFe fest\n    -Xmx<Gr\u00F6\u00DFe>        Legt die maximale Java-Heap-Gr\u00F6\u00DFe fest\n    -Xnoclassgc       Deaktiviert die Klassen-Garbage Collection\n    -Xprof            Gibt CPU-Profilierungsdaten aus (veraltet)\n    -Xrs              Reduziert die Verwendung von BS-Signalen durch Java/VM (siehe Dokumentation)\n    -Xshare:auto      Verwendet, wenn m\u00F6glich, freigegebene Klassendaten (Standard)\n    -Xshare:off       Versucht nicht, freigegebene Klassendaten zu verwenden\n    -Xshare:on        Erfordert die Verwendung von freigegebenen Klassendaten, verl\u00E4uft sonst nicht erfolgreich.\n    -XshowSettings    Zeigt alle Einstellungen an und f\u00E4hrt fort\n    -XshowSettings:all\n                      Zeigt alle Einstellungen an und f\u00E4hrt fort\n    -XshowSettings:locale\n                      Zeigt alle gebietsschemabezogenen Einstellungen an und f\u00E4hrt fort\n    -XshowSettings:properties\n                      Zeigt alle Eigenschaftseinstellungen an und f\u00E4hrt fort\n    -XshowSettings:vm Zeigt alle VM-bezogenen Einstellungen an und f\u00E4hrt fort\n    -Xss<Gr\u00F6\u00DFe>        Legt Stack-Gr\u00F6\u00DFe des Java-Threads fest\n    -Xverify          Legt den Modus der Bytecodeverifizierung fest\n    --add-reads <Modul>=<Zielmodul>(,<Zielmodul>)*\n                      Aktualisiert <Modul>, damit <Zielmodul> ungeachtet der\n                      Moduldeklaration gelesen wird. \n                      <Zielmodul> kann ALL-UNNAMED sein, um alle unbenannten\n                      Module zu lesen.\n    --add-exports <Modul>/<Package>=<Zielmodul>(,<Zielmodul>)*\n                      Aktualisiert <Modul>, um <Package> ungeachtet der Moduldeklaration\n                        in <Zielmodul> zu exportieren.\n                      <Zielmodul> kann ALL-UNNAMED sein, um in alle \n                      unbenannten Module zu exportieren.\n    --add-opens <Modul>/<Package>=<Zielmodul>(,<Zielmodul>)*\n                      Aktualisiert <Modul>, um <Package> ungeachtet der Moduldeklaration\n                      in <Zielmodul> zu \u00F6ffnen.\n    --limit-modules <Modulname>[,<Modulname>...]\n                      Grenzt die Gesamtmenge der beobachtbaren Module ein\n   --patch-module <Modul>=<Datei>({0}<Datei>)*\n                      \u00DCberschreibt oder erweitert ein Modul in JAR-Dateien\n                      oder -Verzeichnissen mit Klassen und Ressourcen.\n    --disable-@files  Deaktiviert die weitere Erweiterung von Argumentdateien\n\nDiese zus\u00E4tzlichen Optionen k\u00F6nnen ohne Vorank\u00FCndigung ge\u00E4ndert werden." },
            { "java.launcher.cls.error1", "Fehler: Hauptklasse {0} konnte nicht gefunden oder geladen werden\nUrsache: {1}: {2}" },
            { "java.launcher.cls.error2", "Fehler: Hauptmethode ist nicht {0} in Klasse {1}. Definieren Sie die Hauptmethode als:\n   public static void main(String[] args)" },
            { "java.launcher.cls.error3", "Fehler: Hauptmethode muss einen Wert vom Typ void in Klasse {0} zur\u00FCckgeben. Definieren Sie \ndie Hauptmethode als:\n   public static void main(String[] args)" },
            { "java.launcher.cls.error4", "Fehler: Hauptmethode in Klasse {0} nicht gefunden. Definieren Sie die Hauptmethode als:\n   public static void main(String[] args):\noder eine JavaFX-Anwendung muss {1} erweitern" },
            { "java.launcher.cls.error5", "Fehler: Zum Ausf\u00FChren dieser Anwendung ben\u00F6tigte JavaFX-Runtime-Komponenten fehlen" },
            { "java.launcher.cls.error6", "Fehler: Beim Laden der Klasse {0} ist ein LinkageError aufgetreten\n\t{1}" },
            { "java.launcher.init.error", "Initialisierungsfehler" },
            { "java.launcher.jar.error1", "Fehler: Beim Versuch, Datei {0} zu \u00F6ffnen, ist ein unerwarteter Fehler aufgetreten" },
            { "java.launcher.jar.error2", "Manifest in {0} nicht gefunden" },
            { "java.launcher.jar.error3", "kein Hauptmanifestattribut, in {0}" },
            { "java.launcher.jar.error4", "Fehler beim Laden des Java-Agents in {0}" },
            { "java.launcher.javafx.error1", "Fehler: Die JavaFX-Methode launchApplication hat die falsche Signatur, sie\nmuss als statisch deklariert werden und einen Wert vom Typ VOID zur\u00FCckgeben" },
            { "java.launcher.module.error1", "Modul {0} weist kein MainClass-Attribut auf. Verwenden Sie -m <module>/<main-class>" },
            { "java.launcher.module.error2", "Fehler: Hauptklasse {0} konnte in Modul {1} nicht gefunden oder geladen werden" },
            { "java.launcher.module.error3", "Fehler: Hauptklasse {0} kann nicht aus Modul {1} geladen werden\n\t{2}" },
            { "java.launcher.module.error4", "{0} nicht gefunden" },
            { "java.launcher.opt.datamodel", "    -d{0}\t  Veraltet, wird in einem zuk\u00FCnftigen Release entfernt\n" },
            { "java.launcher.opt.footer", "    -cp <Klassensuchpfad mit Verzeichnissen und ZIP-/JAR-Dateien>\n    -classpath <Klassensuchpfad mit Verzeichnissen und ZIP-/JAR-Dateien>\n    --class-path <Klassensuchpfad mit Verzeichnissen und ZIP-/JAR-Dateien>\n                  Eine durch {0} getrennte Liste mit Verzeichnissen, JAR-Archiven\n                  und ZIP-Archiven, in denen nach Klassendateien gesucht wird.\n    -p <Modulpfad>\n    --module-path <Modulpfad>...\n                  Eine durch {0} getrennte Liste mit Verzeichnissen, von denen jedes Verzeichnis\n                  ein Verzeichnis mit Modulen ist.\n    --upgrade-module-path <Modulpfad>...\n                  Eine durch {0} getrennte Liste mit Verzeichnissen, von denen jedes Verzeichnis\n                  ein Verzeichnis mit Modulen ist, die upgradef\u00E4hige\n                  Module im Laufzeitimage ersetzen\n    --add-modules <Modulname>[,<Modulname>...]\n                  Root-Module, die zus\u00E4tzlich zum anf\u00E4nglichen Modul aufgel\u00F6st werden sollen.\n                  <Modulname> kann auch wie folgt lauten: ALL-DEFAULT, ALL-SYSTEM,\n                  ALL-MODULE-PATH.\n    --list-modules\n                  Listet beobachtbare Module auf und beendet den Vorgang\n    --d <Modulname>\n    --describe-module <Modulname>\n                  Beschreibt ein Modul und beendet den Vorgang\n    --dry-run     Erstellt eine VM und l\u00E4dt die Hauptklasse, f\u00FChrt aber nicht die Hauptmethode aus.\n                  Die Option \"--dry-run\" kann n\u00FCtzlich sein, um die\n                  Befehlszeilenoptionen, wie die Modulsystemkonfiguration, zu validieren.\n    --validate-modules\n                  Validiert alle Module und beendet den Vorgang\n                  Die Option \"--validate-modules\" kann n\u00FCtzlich sein, um\n                  Konflikte und andere Fehler mit Modulen auf dem Modulpfad zu ermitteln.\n    -D<Name>=<Wert>\n                  Legt eine Systemeigenschaft fest\n    -verbose:[class|module|gc|jni]\n                  Ausgabe im Verbose-Modus aktivieren\n    -version      Gibt die Produktversion an den Fehlerstream aus und beendet den Vorgang\n    --version      Gibt die Produktversion an den Outputstream aus und beendet den Vorgang\n    -showversion  Gibt die Produktversion an den Fehlerstream aus und setzt den Vorgang fort\n    --show-version\n                  Gibt die Produktversion an den Outputstream aus und setzt den Vorgang fort\n    --show-module-resolution\n                  Zeigt die Modulaufl\u00F6sungsausgabe beim Start an\n    -? -h -help\n                  Gibt diese Hilfemeldung an den Fehlerstream aus\n    --help        Gibt diese Hilfemeldung an den Outputstream aus\n    -X            Gibt Hilfe zu zus\u00E4tzlichen Optionen an den Fehlerstream aus\n    --help-extra  Gibt Hilfe zu zus\u00E4tzlichen Optionen an den Outputstream aus\n    -ea[:<packagename>...|:<classname>]\n    -enableassertions[:<packagename>...|:<classname>]\n                  Aktiviert Assertions mit angegebener Granularit\u00E4t\n    -da[:<packagename>...|:<classname>]\n    -disableassertions[:<packagename>...|:<classname>]\n                  Deaktiviert Assertions mit angegebener Granularit\u00E4t\n    -esa | -enablesystemassertions\n                  Aktiviert System-Assertions\n    -dsa | -disablesystemassertions\n                  Deaktiviert System-Assertions\n    -agentlib:<libname>[=<options>]\n                  L\u00E4dt die native Agent Library <libname>. Beispiel: -agentlib:jdwp\n                  siehe auch -agentlib:jdwp=help\n    -agentpath:<pathname>[=<options>]\n                  L\u00E4dt die native Agent Library mit dem vollst\u00E4ndigen Pfadnamen\n    -javaagent:<jarpath>[=<options>]\n                  L\u00E4dt den Java-Programmiersprachen-Agent, siehe java.lang.instrument\n    -splash:<imagepath>\n                  Zeigt den Startbildschirm mit einem angegebenen Bild an\n                  Skalierte HiDPI-Bilder werden automatisch unterst\u00FCtzt und verwendet,\n                  falls verf\u00FCgbar. Der nicht skalierte Bilddateiname (Beispiel: image.ext)\n                  muss immer als Argument an die Option \"-splash\" \u00FCbergeben werden.\n                  Das am besten geeignete angegebene skalierte Bild wird\n                  automatisch ausgew\u00E4hlt.\n                  Weitere Informationen finden Sie in der Dokumentation zur SplashScreen-API\n    @argument files\n                  Eine oder mehrere Argumentdateien mit Optionen\n    -disable-@files\n                  Verhindert die weitere Erweiterung von Argumentdateien\nUm ein Argument f\u00FCr eine lange Option anzugeben, k\u00F6nnen Sie --<Name>=<Wert> oder\n--<Name> <Wert> verwenden.\n" },
            { "java.launcher.opt.header", "Verwendung: {0} [Optionen] <mainclass> [args...]\n           (zur Ausf\u00FChrung einer Klasse)\n   oder  {0} [Optionen] -jar <jarfile> [args...]\n           (zur Ausf\u00FChrung einer JAR-Datei)\n   oder  {0} [Optionen] -m <module>[/<mainclass>] [args...]\n       {0} [Optionen] --module <module>[/<mainclass>] [args...]\n            (zur Ausf\u00FChrung der Hauptklasse in einem Modul)\n\n Argumente, die auf die Hauptklasse folgen, -jar <jarfile>, -m oder --module\n <module>/<mainclass> werden als Argumente f\u00FCr die Hauptklasse \u00FCbergeben.\n\n wobei \"Optionen\" Folgendes umfasst:\n\n" },
            { "java.launcher.opt.hotspot", "    {0}\t  ist ein Synonym f\u00FCr die \"{1}\" VM  [verworfen]\n" },
            { "java.launcher.opt.vmselect", "    {0}\t  zur Auswahl der \"{1}\" VM\n" },
        };
    }
}
