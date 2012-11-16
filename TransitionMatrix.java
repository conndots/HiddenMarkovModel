package Running.HMModel;

import java.util.ArrayList;

public abstract class TransitionMatrix<T>{
	protected ArrayList<T> data;
	public abstract double transitionProbability(T i, T j);
	public ArrayList<T> getValues(){
		return new ArrayList<T>(data);
	}
}

