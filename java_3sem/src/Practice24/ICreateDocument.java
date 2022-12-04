package Practice24;

public abstract class ICreateDocument { // абстрактный фабричный класс
    protected abstract IDocument CreateNew(); // содержит 2 метода
    protected abstract IDocument CreateOpen();
}
