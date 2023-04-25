package comportamentais.strategy;

public enum ETipoFrete {

    NORMAL {
        @Override
        public Frete obterClasseFrete() {
            return new FreteNormal();
        }
    },
    SEDEX  {
        @Override
        public Frete obterClasseFrete() {
            return new FreteSedex();
        }
    };

    public abstract Frete obterClasseFrete();
}
