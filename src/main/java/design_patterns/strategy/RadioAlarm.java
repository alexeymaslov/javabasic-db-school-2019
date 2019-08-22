package design_patterns.strategy;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.experimental.Delegate;

/**
 * @author Evgeny Borisov
 */
@AllArgsConstructor
@Setter
public class RadioAlarm implements Radio, Alarm {

    @Delegate
    private Radio radio = new RadioImpl();
    @Delegate(excludes = AlarmExclusions.class)
    private Alarm alarm = new AlarmImpl();

    @Override
    public void c() {

    }
}
