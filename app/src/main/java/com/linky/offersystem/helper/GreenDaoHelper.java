package com.linky.offersystem.helper;

/**
 * Created by Linky on 16-11-28.
 */
public class GreenDaoHelper {

//    private static final String DB_NAME = "pitaya.db";
//
//    private DaoMaster mDaoMaster;
//
//    @Inject
//    public GreenDaoHelper(Context context) {
//
//        // 创建消息数据库
//        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(context, DB_NAME, null);
//        mDaoMaster = new DaoMaster(helper.getWritableDatabase());
//
//        if (!hasMessage()) {
//            init();
//        }
//    }
//
//    private void init() {
//
//        // 创建消息数据库
//        DaoSession daoSession = mDaoMaster.newSession();
//        MessageDao messageDao = daoSession.getMessageDao();
//
//        // 导入聊天信息 100 条
//        List<Message> messages = new ArrayList<>();
//        for (int i = 0; i < 100; i++) {
//            Message message = new Message(null, "你好啊" + i, "路人" + i);
//            messages.add(message);
//        }
//
//        messageDao.insertInTx(messages);
//    }
//
//    private boolean hasMessage() {
//        return mDaoMaster.newSession().getMessageDao().count() > 0;
//    }
//
//    /**
//     * 加载消息
//     * @param index 消息索引
//     * @param count 消息数量
//     */
//    public List<Message> loadMessages(int index, int count) {
//        if (index < 0) {
//            throw new IllegalArgumentException("非法索引");
//        }
//
//        MessageDao messageDao = mDaoMaster.newSession().getMessageDao();
//        QueryBuilder<Message> qb = messageDao.queryBuilder().where(MessageDao.Properties.Id.ge(index));
//        return qb.limit(count).list();
//    }
}
