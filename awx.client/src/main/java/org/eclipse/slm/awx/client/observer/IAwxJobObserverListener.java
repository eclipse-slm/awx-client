package org.eclipse.slm.awx.client.observer;

public interface IAwxJobObserverListener {

    void onJobStateChanged(AwxJobObserver sender, JobState newState);

    void onJobStateFinished(AwxJobObserver sender, JobFinalState finalState);

}
