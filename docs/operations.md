# Operação

Tópicos separados por canal usam retry com backoff exponencial, chave de
idempotência e DLQ. Métricas mínimas: latência, taxa de entrega, retries,
tamanho da DLQ e idade da mensagem mais antiga.
