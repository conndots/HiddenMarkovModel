import java.util.ArrayList;

public interface TransitionMatrix<T>{
	public abstract double transitionProbability(T i, T j);
	public ArrayList<T> getValues();
}

