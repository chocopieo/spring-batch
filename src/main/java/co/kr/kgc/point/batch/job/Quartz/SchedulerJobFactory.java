//package co.kr.kgc.point.batch.job.Quartz;
//
//import org.quartz.spi.TriggerFiredBundle;
//import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContextAware;
//import org.springframework.scheduling.quartz.SpringBeanJobFactory;
//
//public class SchedulerJobFactory extends SpringBeanJobFactory implements ApplicationContextAware {
//    private AutowireCapableBeanFactory beanFactory;
//
//    @Override
//    public void setApplicationContext(ApplicationContext applicationContext) {
//        beanFactory = applicationContext.getAutowireCapableBeanFactory();
//    }
//
//    @Override
//    protected Object createJobInstance(TriggerFiredBundle bundle) throws Exception {
//        final Object job = super.createJobInstance(bundle);
//        beanFactory.autowireBean(job);
//        return job;
//    }
//}
