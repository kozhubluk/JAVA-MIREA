package Practice24;

public abstract class IDocument { // абстрактный класс, представл. док. неопределенного рода
    protected abstract void DoOpen(); // общие св-ва
    protected abstract void DoNew();
    protected abstract void DoSave();

    protected abstract void DoExit();
}