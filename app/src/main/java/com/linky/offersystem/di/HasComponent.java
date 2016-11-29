package com.linky.offersystem.di;

/**
 * Created by linky on 16-8-30.
 * 代表 包含用于依赖注入的 Component 的 Client 的契约
 */
public interface HasComponent<C> {
    C getComponent();
}
