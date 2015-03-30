import java.util.ArrayList;


public interface ConfusionMatrix<ST, OT> {
	public abstract double transformProbability(ST i, OT j);
}



