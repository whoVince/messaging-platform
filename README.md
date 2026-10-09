# Messaging Platform

MVP de mensageria assíncrona com inbox unificado, filas, prioridades,
notificações, WebSocket, retry, idempotência e Dead Letter Queue.

## Fluxo

1. `POST /api/messages` aceita uma mensagem com `idempotencyKey`.
2. A mensagem é roteada para a fila e prioridade adequadas.
3. Entrega falha gera retry com backoff.
4. Após o limite, a mensagem vai para a DLQ e fica disponível para replay.

Consulte [docs/api.md](docs/api.md) e [docs/operations.md](docs/operations.md).
